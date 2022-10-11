class Subject1s
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;

    public Subject1s(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }

    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtains;}

    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }

    public void setMarksObtain(int m)
    {
        marksObtains=m;
    }

    boolean isQualified()
    {
        return marksObtains>=maxMarks/10*4;
    }

    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }

}

public class Constructor10 {

    public static void main(String[] args)
    {
        Subject1s subs[]=new Subject1s[3];
        subs[0]=new Subject1s("s101","DS",100);
        subs[1]=new Subject1s("s102","Algorithms",100);
        subs[2]=new Subject1s("s103","Operating Systems",100);

        for(Subject1s s:subs)
            System.out.println(s);
    }

}