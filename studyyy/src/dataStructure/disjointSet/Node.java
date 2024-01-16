package dataStructure.disjointSet;

public class Node {
    int parent; // 부모의 레퍼런스
    int rank; // rank

    public Node(int newParent, int newRank) {
        this.parent = newParent;
        this.rank = newRank;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int newParent) {
        this.parent = newParent;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int newRank) {
        this.rank = rank;
    }
}
