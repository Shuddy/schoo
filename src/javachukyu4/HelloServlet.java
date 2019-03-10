package javachukyu4;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java入門 Hello World出力クラス.
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * コンストラクタ.
	 */
    public HelloServlet() {
        super();
    }

    /**
     * GETメソッドで呼び出された場合の処理
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//画面に出力する内容の設定
		//出力する内容がHTMLであることを設定
		response.setContentType("text/html");
		//出力する画面の文字コードをUTF-8に設定
		response.setCharacterEncoding("UTF-8");

		PrintWriter pw = response.getWriter();

		//HTMLを出力
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Java入門</title>");
		pw.println("<body>");
		pw.println("<h1>Hello World!!</h1>");
		pw.println("</body>");
		pw.println("</html>");
	}

	/**
	 * POSTメソッドで呼び出された場合の処理
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGetメソッドに処理を任せる
		doGet(request, response);
	}
}