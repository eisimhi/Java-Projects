public class Package {
    private Person Person_recipient;
    private int _trackNum;
    private int _status;
    // המשתנה הזה מציין את המצב ההתחלתי של החבילה שהוא כרגע כלום
    public static final int STATUS_NONE=0;
    // המשתנה הזה מציין את המצב הראשון של החבילה שהחבילה כרגע נארזה
    public static final int STATUS_PACKED=1;
    // המשתנה הזה מציין שהחבילה נשלחה
    public static final int STATUS_SENT=2;
    // המשתנה הזה מציין שהחבילה הגיעה ליעד
    public static final int STATUS_ARRIVED=3;
    // המשתנה הזה מציין שהחבילה הגיעה לנמען שהזמין אותה
    public static final int STATUS_DELIVERED=4;
    // המשתנה הזה הוא משתנה של ברירת מחדל במקרה שמספר החבילה הוא לא תקין
    public static final int DEF_TRACKNUM=10000000;
        //פה יש בנאי של חבילה שלוקח את האדם ומספר חבילה ומעדכן אותם ובנוסף הוא מוסיף לו סטטוס של 0 שזה מציין את המצב ההתחלתי של החבילה
    public Package(Person recipient, int trackNum){
        this.Person_recipient = new Person(recipient);
        if (isValidTrackNum(trackNum)){
            this._trackNum=trackNum;
        }else {
            this._trackNum=DEF_TRACKNUM;
        }
        this._status=STATUS_NONE;
    }
    // זאת שיטה פומבית שבודקת האם מספר החבילה הוא בהתאם לתנאים(יש לו 8 ספרות)
public boolean isValidTrackNum(int n){
        return n>=10000000&&n<=99999999;
}
    // זה שיטת אחזור שמביאה את המצב שבה החבילה נמצאת כרגע
    public int getStatus() {
        return _status;
    }
        // זה שיטת אחזור שמביאה את מספר החבילה
    public int getTrackNum() {
        return _trackNum;
    }
        // זה שיטה קובעת שמשנה את מספר החבילה אם הוא עומד בתנאים(8 ספרות)
    public void setTrackNum(int _trackNum) {
        if (isValidTrackNum(_trackNum)){
            this._trackNum = _trackNum;
        }
    }
    //שיטת אחזור שמחזירה את הבן אדם: את השם שלו, מספר טלפון וכתובת
    public Person getRecipient() {
        return new Person(Person_recipient);
    }

    //שיטה קובעת שמשנה את הבן אדם שמקבל את החבילה
    public void setRecipient(Person person_recipient) {
        this.Person_recipient = new Person(person_recipient);
    }

    //שיטה שמשנה את המצב של החבילה ב-1, לכל מצב של חבילה יש מספר מ0-4 והשיטה הזאת מעלה את המצב ב-1
    public void updateStatus(){
        if (this._status!=STATUS_DELIVERED) this._status++;
        }

    // שיטה שמחזירה את המצב של החבילה במילים: אם החבילה נארזה אז ישלח"PACKED" אם היא הגיעה ישלח "DELIVERED" וכו'
        public String getStatusName(){
            switch (_status){
                case STATUS_NONE : return "NONE";
                case STATUS_PACKED : return "PACKED";
                case STATUS_SENT : return "SENT";
                case STATUS_ARRIVED : return "ARRIVED";
                case STATUS_DELIVERED : return "DELIVERED";
                default:return "UNKNOWN";
                }
            }
            // מחזירה אמת אם החבילה נמסרה, שקר אם לא
            public boolean isDelivered(){
                return this._status==STATUS_DELIVERED;
            }
            // שיטת ToString שמדפיסה את מספר החבילה, את השם של האדם, הכתובת, מספר טלפון, ומצב החבילה
            public String toString(){
                return "Package "+_trackNum+", To "+Person_recipient.getName()+", Address: "+Person_recipient.getAddress()+" Tel: "+Person_recipient.getPhone()+", Status="+getStatusName();
            }
            // שיטה שבודקת האם התכונות של החבילה שוות לתכונות החבילה שעליה הופעלה השיטה
            public boolean equals(Package p){
                return p.Person_recipient.equals(this.Person_recipient)&&p._trackNum==this._trackNum&&p._status==this._status;
            }
            // שיטה שבודקת אם השם של הנמען של החבילה הנוכחית, קודם בסדר הא"ב לחבילה שהתקבלה כפרמטר
            public boolean before(Package p){
                return this.Person_recipient.getName().compareTo(p.Person_recipient.getName())<0&& !equals(p);
            }
                // שיטה שבודקת הפוך מהשיטה הקודמת- האם השם של הנמען מגיע אחרי השם שהתקבל כפרמטר
            public boolean after(Package p){
                return !before(p);
            }
            // השיטה מחזירה אמת אם החבילה הגיעה ליעדה וגם שם האם שהתקבל כפרמטר שווה לנמען
            public boolean deliver(Person p) {
                if (p.getName().equals(this.Person_recipient.getName()) && this._status == STATUS_ARRIVED) {
                    this._status = STATUS_DELIVERED;
                    return true;
                }
                return false;
            }
        }
