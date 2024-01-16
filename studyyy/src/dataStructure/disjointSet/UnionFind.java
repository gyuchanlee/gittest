package dataStructure.disjointSet;

public class UnionFind {
    protected Node[] a;

    public UnionFind(Node[] a) {
        this.a = a;
    }

    // i가 속한 집합의 루트를 순환 호출로 찾고 경로상의 각 원소의 부모를 루트로 만든다.
    protected int find(int i) {
        // 경로 압축
        if (i != a[i].getParent()) {
            a[i].setParent(find(a[i].getParent()));
        }
        return a[i].getParent();
    }

    public void union(int i, int j) {
        // union 연산
        int iroot = find(i);
        int jroot = find(j);
        if (iroot == jroot) {
            return; // 루트가 동일하다면 더이상 수행 없이 리턴.
        }
        // rank가 높은 곳이 승자.
        if (a[iroot].getRank() > a[jroot].getRank()) {
            a[jroot].setParent(iroot); // iroot가 승자
        } else if (a[iroot].getRank() < a[jroot].getRank()) {
            a[iroot].setParent(jroot); // jroot가 승자
        } else {
            a[jroot].setParent(iroot); // 임의로 둘 중 한명이 승자
            int t = a[iroot].getRank() + 1;
            a[iroot].setRank(t); // iroot의 랭크 1증가.
        }
    }
}
