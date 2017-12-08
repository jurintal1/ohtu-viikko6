package statistics.matcher;

import java.util.ArrayList;

public class QueryBuilder {

    ArrayList<Matcher> matchers;
    
    public QueryBuilder() {
        this.matchers = new ArrayList();
    }
    
    public QueryBuilder and(Matcher... matchers) {
        this.matchers.add(new And(matchers));
        return this;
    }
    
    public QueryBuilder hasAtLeast(int value, String category) {
        this.matchers.add(new HasAtLeast(value, category));        
        return this;
    }
    
    public QueryBuilder hasFewerThan(int value, String category) {
        this.matchers.add(new HasFewerThan(value, category));
        return this;
    }
    
    public Matcher build() {
        Matcher[] m = this.matchers.toArray(new Matcher[this.matchers.size()]);
        this.matchers = new ArrayList();
        return new And(m);
    }
    
    public QueryBuilder not(Matcher matcher) {
        this.matchers.add(new Not(matcher));
        return this;
    }
    
    public QueryBuilder or(Matcher... matchers) {
        this.matchers.add(new Or(matchers));
        return this;
    }
    

    
    public QueryBuilder playsIn(String team) {
        this.matchers.add(new PlaysIn(team));
        return this;
    }
    
}
