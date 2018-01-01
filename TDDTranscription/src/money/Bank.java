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
		
		return source.reduce(to);
	}
	void addRate(String from,String to,int rate) {
		
	}

}
