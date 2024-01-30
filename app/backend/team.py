from nba_api.stats.endpoints import leaguestandings
import random

class Team():
    """
    NBA Team Class
    """
    def __init__(self, win_pct, name, diffPPG):
        self.win_pct = win_pct
        self.name = name
        self.diffPPG = diffPPG
        
        self.strength = self.win_pct + self.diffPPG/10000 
    
    def __str__(self):
        return self.name
    
class Standings():
    """
    NBA Standings Class
    """
    def __init__(self):
        self.standings = None
        self.named_standings = []
        self.randomized_standings = None
        self.basic_standings()
        
    def basic_standings(self):
        """
        Updates and returns self.named_standings
        """
        # Get standings
        nba_standings = leaguestandings.LeagueStandings().standings.get_dict()["data"]
        all_teams = []
        for item in nba_standings:
            all_teams.append(Team(item[14], item[4], item[58]))
        # Sort by strength (win percentage w/tie breaker)
        all_teams.sort(key=lambda x: x.strength)
        
        for x in range(0,30):
            all_teams[x] = all_teams[x].name
        self.named_standings = all_teams
        return all_teams
    
    def simulate_lottery(self):
        """
        Simulates the NBA lottery, updates randomized_standings
        """
        lottery_picks = self.named_standings[0:14]
        simulated = random.choices(lottery_picks, weights = (14, 14, 14, 12.5, 10.5, 9, 7.5, 6, 4.5, 3, 2, 1.5, 1, 0.5), k = 30)
        top_4 = []
        for team in simulated:
            if len(top_4) > 3:
                break
            if team not in top_4:
                top_4.append(team)
        for team in self.named_standings:
            if team not in top_4:
                top_4.append(team)
        
        
        self.randomized_standings = top_4
        pass
    
    def serialized_simulated(self) -> {int:str}:
        """
        Returns simulated lottery in json form
        """
        order = {}
        try:
            for x in range(0,len(self.randomized_standings)):
                order[x] = self.randomized_standings[x]
            return order
        except:
            return {"error": "you must randomize standings first"}