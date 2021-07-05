package davit.dev.doubleformat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DoubleFormat {
    public String getCurrencyFormat(final String amount) {
        final DecimalFormat formatter = new DecimalFormat("$" + "#,###0.00", new DecimalFormatSymbols(Locale.US));
        return formatter.format(Double.parseDouble(amount));
    }

    public String getDoubleFormat(final String amount) {
        final DecimalFormat formatter = new DecimalFormat("#,###0.00", new DecimalFormatSymbols(Locale.US));
        return formatter.format(Double.parseDouble(amount));
    }
}
