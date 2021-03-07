/**
 * 选择排序
 * <p>
 * 1. 运行时间与输入无关（初始顺序）
 * 2. 数据移动最少
 */
public class Selection extends SortTemplate {
    @Override
    public  void sort(Comparable[] a) {
        // 将数组升序排列
        int length = a.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (less(a[j], a[i])) exch(a, i, j);
            }
        }
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        SortTemplate selection = new Selection();
        selection.sort(a);
        selection.show(a);
    }
}
