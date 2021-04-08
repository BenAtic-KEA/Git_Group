package problemSet;

public abstract class AbstractProblem {
    private final String problemDescription;

    public AbstractProblem(String problemDescription){
        this.problemDescription = problemDescription;
    }

    public abstract void printProblemDescription();

    public abstract void solution();
}
