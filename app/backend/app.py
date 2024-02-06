from flask import                       Flask, request
import                                  json
import                                  os
from nba_api.stats.endpoints import     leaguestandings
from team import                        Team, Standings

app = Flask(__name__)
nba_standings = Standings()

@app.route("/")
def greeting():
    return "Hello!"

@app.route("/standings")
def getStandings() -> list:
    return nba_standings.basic_standings() 

@app.route("/simulate")
def simulate() -> list:
    nba_standings.simulate_lottery()
    return nba_standings.serialized_simulated()


if __name__ == "__main__":
    app.run(host="0.0.0.0", port=8000, debug=True)
