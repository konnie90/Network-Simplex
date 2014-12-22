package net_simplex;

public class Arc {
	int startnode;
	int endnode;
	int lowerb;
	int upperb;
	int cost;
	int flow;
	
	public Arc(int strt, int endn, int low, int upp, int cst, int flow) {
		startnode=strt;
		endnode=endn;
		lowerb=low;
		upperb=upp;
		cost=cst;
		this.flow=flow;
	}

	public boolean isInitialized() {
		if(0>startnode || 0>endnode|| lowerb>upperb || flow<lowerb || flow >upperb) return false;
		return true;
	}

}
