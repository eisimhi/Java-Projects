public class HotelRoom {
    private int _roomNum;
    private int _numBeds;
    private boolean _occupied;
    private String _guest;

    private static final int minRoom = 100;
    private static final int maxRoom = 999;
    private static final int minBeds = 2;
    private static final int maxBeds = 4;


    public HotelRoom(int _roomNum,int _numBeds){
        if (roomNumOk(_roomNum))
            this._roomNum=_roomNum;
        else
            this._roomNum=maxRoom;

        if (numBedsOk(_numBeds))
            this._numBeds=_numBeds;
        else
            this._numBeds=minBeds;
        this._guest = "";
        this._occupied = false;

    }

    public String getGuest() {
        return _guest;
    }

    public boolean isOccupied() {
        return _occupied;
    }

    public int getNumBeds() {
        return _numBeds;
    }

    public void setNumBeds(int _numBeds) {
        if (numBedsOk(_numBeds))
            this._numBeds=_numBeds;

    }

    public int getRoomNum() {
        return _roomNum;
    }

    public void setRoomNum(int _roomNum) {
        if (roomNumOk(_roomNum))
            this._roomNum=_roomNum;

    }
    private boolean roomNumOk(int roomNum){
        if (roomNum<minRoom||roomNum>maxRoom)
            return false;
        else
            return true;
    }
    private boolean numBedsOk(int numBeds){
        if (numBeds<minBeds||numBeds>maxBeds)
            return false;
        else
            return true;
    }
    public boolean equals(HotelRoom other){
        return this._roomNum == other._roomNum &&
                this._numBeds == other._numBeds;
    }

    public boolean before(HotelRoom other){
        return this._roomNum< other.getRoomNum();
    }
    public boolean after(HotelRoom other){
        return other.before(this);
    }

    public boolean checkIn(String guest) {
        if (this.isOccupied()) {
            return false;
        }

        this._guest = guest;
        this._occupied = true;
        return true;
    }
    public void checkOut(){
        this._occupied=false;
        this._guest="";
    }



    public String toString() {

        String o;
        if (isOccupied())
            o="Occupied by "+getGuest();
        else
            o="Available";
        return "Room "+_roomNum+", "+_numBeds+" Beds: "+o;
    }
}
