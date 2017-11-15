package ru.krohmal.task;

/**
 * Created by Comp on 15.11.2017.
 */
public class Articles {
    /**
     * category code (sport)
     */
    private int codeCateg;
    /**
     * subcategory code of zero level
     */
    private int codeSub0;
    /**
     * subcategory code of the first level
     */
    private int codeSub1;
    /**
     * subcategory code of the second level
     */
    private int codeSub2;
    /**
     * article number
     */
    private int articNum;

    public Articles(int codeCateg, int codeSub0, int codeSub1, int codeSub2, int articNum) {
        this.codeCateg = codeCateg;
        this.codeSub0 = codeSub0;
        this.codeSub1 = codeSub1;
        this.codeSub2 = codeSub2;
        this.articNum = articNum;
    }

    public int getCodeCateg() {
        return codeCateg;
    }

    public void setCodeCateg(int codeCateg) {
        this.codeCateg = codeCateg;
    }

    public int getCodeSub0() {
        return codeSub0;
    }

    public void setCodeSub0(int codeSub0) {
        this.codeSub0 = codeSub0;
    }

    public int getCodeSub1() {
        return codeSub1;
    }

    public void setCodeSub1(int codeSub1) {
        this.codeSub1 = codeSub1;
    }

    public int getCodeSub2() {
        return codeSub2;
    }

    public void setCodeSub2(int codeSub2) {
        this.codeSub2 = codeSub2;
    }

    public int getArticNum() {
        return articNum;
    }

    public void setArticNum(int articNum) {
        this.articNum = articNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Articles articles = (Articles) o;

        if (codeCateg != articles.codeCateg) return false;
        if (codeSub0 != articles.codeSub0) return false;
        if (codeSub1 != articles.codeSub1) return false;
        if (codeSub2 != articles.codeSub2) return false;
        return articNum == articles.articNum;
    }

    @Override
    public int hashCode() {
        int result = codeCateg;
        result = 31 * result + codeSub0;
        result = 31 * result + codeSub1;
        result = 31 * result + codeSub2;
        result = 31 * result + articNum;
        return result;
    }
}
