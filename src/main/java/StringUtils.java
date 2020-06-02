import static org.apache.commons.lang3.BooleanUtils.isTrue;
import static org.apache.commons.lang3.StringUtils.isEmpty;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if(isEmpty(str)) {
            return false;
        }
        int number = Integer.valueOf(str);

        return isTrue(number > 0);
    }
}
