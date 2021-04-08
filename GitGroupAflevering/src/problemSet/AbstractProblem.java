package problemSet;

public abstract class AbstractProblem {
    private String problemDescription;

    public AbstractProblem(String problemDescription){
        this.problemDescription = problemDescription;
    }

    public abstract void printProblemDescription();

    public abstract void solution();
}
