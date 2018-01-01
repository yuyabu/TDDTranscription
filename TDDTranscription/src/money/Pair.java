package money;

/**
 * 為替のレート保管用のハッシュテーブルのキー用クラス。
 * 
 * @author yuyabu
 *
 */
class Pair {
	private String from;
	private String to;
	/**
	 * 
	 * @param from 変換まえの通過
	 * @param to　変換ごの通過
	 */
	Pair(String from,String to){
		this.from = from;
		this.to= to;
	}
	public boolean equals(Object object) {
		Pair pair = (Pair) object;
		return from.equals(pair.from) && to.equals(pair.to);
	}
	public int hashCode() {
		return 0;
	}
	
}
