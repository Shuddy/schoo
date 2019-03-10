package javachukyu5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java入門 Formデータ連携クラス
 */
@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * コンストラクタ.
	 */
    public RequestServlet() {
        super();
    }

    /**
     * GETメソッドでリクエストされた場合の処理.
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String text1 = "";	// テキスト1格納用変数
		String text2 = "";	// テキスト2格納用変数

		// JSPの画面から値を取得
		text1 = request.getParameter("text1");
		text2 = request.getParameter("text2");

		// 画面に出力する内容の設定
		// 出力する内容がHTMLであることを設定
		response.setContentType("text/html");
		// 出力する画面の文字コードをUTF-8に設定
		response.setCharacterEncoding("UTF-8");

		// 画面に出力するためのWriterクラスインスタンスを取得
		PrintWriter pw = response.getWriter();

		// HTMLを出力
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Java入門</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>入力結果</h1>");
		pw.println("<p>入力された値は「" + text1
					+ "」と「" + text2 + "」です。</p>");
		pw.println("</body>");
		pw.println("</html>");
	}
}