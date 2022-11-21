from AbstractEvent import AbstractEvent
import json
from datetime import datetime

class 주문됨(AbstractEvent):
    id : int
    품목 : str
    수량 : int
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.품목 = None
        self.수량 = None

