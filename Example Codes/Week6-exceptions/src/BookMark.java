
public class BookMark <T> {
	public String bm;
	public BookMark(){
		bm="defualt";
	}
public void addBookMark(T bk) {
	System.out.println(bk.toString());
}
public static void main(String args[]) {
	BookMark <Book> bmark=new BookMark <Book>();
	bmark.addBookMark(new FictionBook());
	BookMark <WebsiteAddress> web=new BookMark <WebsiteAddress>();
	web.addBookMark(new WebsiteAddress());
}

}
