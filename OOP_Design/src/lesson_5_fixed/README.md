This design violated the OCP (Open Closed Principle).

The class "EmergencyRoomProcess" has too many responsibilities. If you are going to add more different hospital roles in to this class, 
the code is going to be messy as you add more operations of different roles and eventually will become hard to manage.

Open Closed Principle states that software is open for extension and closed for modification. This class is a big violator of the OCP.