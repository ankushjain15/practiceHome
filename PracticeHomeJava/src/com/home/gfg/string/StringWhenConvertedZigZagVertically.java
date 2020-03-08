package com.home.gfg.string;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/zigzag-conversion/
 * how would a string read when printed zigzag vertically over a give number of rows.
 * e.g ankushjain printed over 3 rows would be read as asinuhankj
 *      a   s   i
 *      n u h a n
 *      k   j
 */

public class StringWhenConvertedZigZagVertically {

    public static String convertZigZagVertically(String str, int numRows)
    {
        if (numRows == 1) {
            return str;
        }

        boolean goingDown = false;
        int currentRow = 0;
        List<StringBuilder> rows = new ArrayList<>();
        for (int i=0; i < Math.min(numRows, str.length()); i++)
        {
            rows.add(new StringBuilder());
        }

        for (char c : str.toCharArray())
        {
            rows.get(currentRow).append(c);
            if (currentRow==0 || currentRow == (numRows - 1))
            {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder retStr = new StringBuilder();
        for (StringBuilder strRow : rows) {
            retStr.append(strRow.toString());
        }

        return retStr.toString();
    }
}
