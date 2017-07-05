package company.hamza.com.geoquiz;

/**
 * Created by jhon on 6/28/2016.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;
    public TrueFalse(int question,boolean truequestion){
        mQuestion=question;
        mTrueQuestion=truequestion;
    }
    public int getQuestion(){
        return mQuestion;
    }
    public void setquestion(int question)
    {
        mQuestion=question;
    }
    public boolean isTrueQuestion(){
        return mTrueQuestion;
    }
    public void setTrueQuestion(boolean trueQuestion){
        mTrueQuestion=trueQuestion;
    }
}
