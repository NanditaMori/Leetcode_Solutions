class Solution {
      public int minAddToMakeValid(String s) {

            // Count of unmatched '('
            int left = 0;

            // Count of unmatched ')'
            int right = 0;

            for (char ch : s.toCharArray()) {

                  if (ch == '(') {
                        // Store this opening parenthesis.
                        // It can match a future ')'.
                        left++;
                  } else {

                        // If an unmatched '(' exists,
                        // use it to match the current ')'.
                        if (left > 0) {
                              left--;
                        } else {
                              // No '(' is available for this ')'.
                              // We need to insert an '(' before it.
                              right++;
                        }
                  }
            }

            // Remaining '(' need ')'
            // and unmatched ')' need '('.
            return left + right;
      }
}