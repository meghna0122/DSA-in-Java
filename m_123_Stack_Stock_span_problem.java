import java.util.Stack;

public class m_123_Stack_Stock_span_problem {

    public static void StockSpan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < span.length; i++) {
            int currprice = stock[i];

            while (stock[s.peek()] < currprice && !s.isEmpty()) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stock.length];
        StockSpan(stock, span);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
