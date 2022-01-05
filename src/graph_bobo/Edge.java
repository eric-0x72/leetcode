package graph_bobo;

/**
 * @param weight : weight extends Number&Comparable, implements Comparable
 *               interface
 *               <p>
 *               extends parent class, implements interface
 * @author zwb
 */

public class Edge<Weight extends Number & Comparable> implements Comparable<Edge<Weight>> {

    private int a, b; // �ߵ������˵�
    private Weight weight; // �ߵ�Ȩֵ

    public Edge(int a, int b, Weight weight) {
        this.a = a;
        this.b = b;
        this.weight = weight;
    }

    public Edge(Edge<Weight> e) {
        this.a = e.a;
        this.b = e.b;
        this.weight = e.weight;
    }

    public int v() {
        return a;
    } // ���ص�һ������

    public int w() {
        return b;
    } // ���صڶ�������

    public Weight wt() {
        return weight;
    } // ����Ȩֵ

    // ����һ������, ������һ������
    public int other(int x) {
        assert x == a || x == b;
        return x == a ? b : a;
    }

    // ����ߵ���Ϣ
    public String toString() {
        return "" + a + "-" + b + ": " + weight;
    }

    // ��֮��ıȽ�
    public int compareTo(Edge<Weight> that) {
        if (weight.compareTo(that.wt()) < 0)
            return -1;
        else if (weight.compareTo(that.wt()) > 0)
            return +1;
        else
            return 0;
    }
}
