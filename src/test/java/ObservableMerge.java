import org.junit.Test;
import rx.Observable;


public class ObservableMerge {

    static int count = 0;

    @Test

    public void testMerge() {
        Observable.merge(obString(), obString1())
                  .subscribe(result -> showResult(result.toString()));
    }

    private void showResult(String s) {
        System.out.println(s);
        System.out.println(++count);
    }

    public Observable<Person> obString() {
        return Observable.just(new Person("pablo", 34, null));
    }

    public Observable<Person> obString1() {
        return Observable.just(new Person(null, 25, "male"));
    }

}
