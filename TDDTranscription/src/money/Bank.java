package money;

import java.util.HashMap;
import java.util.Map;

class Bank {
	private Map<Pair,Integer> rates = new HashMap<>();
	/**
	 * 英語のreduceには、式を単純な形に変形(簡約)するという意味がある
	 * 出典:12章
	 * @param source
	 * @param to
	 * @return
	 */
	Money reduce(Expression source,String to) {
		
		return source.reduce(this,to);
	}
	void addRate(String from,String to,int rate) {	
		rates.put(new Pair(from,to), rate);
	}
	int rate(String from,String to) {
		if(from.equals(to)) return 1;//変換前、変換後が同じ通過の場合は1を返す
		return rates.get(new Pair(from,to));
	}
}
