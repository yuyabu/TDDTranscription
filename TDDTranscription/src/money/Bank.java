package money;

class Bank {
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
	}
	int rate(String from,String to) {
		return(from.equals("CHF")&& to.equals("USD")) ? 2:1;

	}
}
