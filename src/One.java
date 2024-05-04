//In this simple assignment you are given a number and have to make it negative.
// But maybe the number is already negative?

//Examples

//One.makeNegative(1);  // return -1
//One.makeNegative(-5); // return -5
//One.makeNegative(0);  // return 0

// TODO after solving notes -- need to use libraries more could have used absolute value to simplify problem more
public class One {
    public static int makeNegative(final int x){

        if (x < 0) {
            return x;
        } else if (x > 0) {
            return -x;
        } else {
            return 0;
        }
    }
}

