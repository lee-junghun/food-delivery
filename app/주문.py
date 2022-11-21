from sqlalchemy.ext.declarative import declarative_base 
from sqlalchemy import Column, String, Integer, event, Float, Boolean
from datetime import datetime

import util
from 주문됨 import 주문됨
from external.결제이력 import 결제이력
from external.결제이력Service import 결제
from 주문취소됨 import 주문취소됨
from 주문됨 import 주문됨
from external.결제이력 import 결제이력
from external.결제이력Service import 결제
from 주문취소됨 import 주문취소됨

Base = declarative_base()

class 주문(Base):
    __tablename__ = '주문_table'
    id = Column(Integer, primary_key=True)
    품목 = Column(String(50))
    수량 = Column(Integer)

    def __init__(self):
        self.id = None
        self.품목 = None
        self.수량 = None

@event.listens_for(주문, 'after_insert')
def PostPersist(mapper, connection, target):
    event = 주문됨()
    event = util.AutoBinding(target, event)

    event.Publish()
    
    결제이력 = 결제이력()
    response = 결제(결제이력)

    print(response)
    event = 주문됨()
    event = util.AutoBinding(target, event)

    event.Publish()
    
    결제이력 = 결제이력()
    response = 결제(결제이력)

    print(response)

    
@event.listens_for(주문, 'before_insert')
def PrePersist(mapper, connection, target):
    event = 주문취소됨()
    event = util.AutoBinding(target, event)

    event.Publish()
    
    event = 주문취소됨()
    event = util.AutoBinding(target, event)

    event.Publish()
    

    
@event.listens_for(주문, 'before_delete')
def PreRemove(mapper, connection, target):

    

