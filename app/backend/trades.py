class Trades():
    """
    Class representing the trades to be applied to the standings
    after randomization
    """
    def __init__(self, standings: list[str]):
        self.standings = standings