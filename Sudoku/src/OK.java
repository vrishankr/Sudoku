

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OK")
public class OK extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		SudokuSolver sol=new SudokuSolver();
		 int[][] a=new int[9][9];
		 a[0][0]=Integer.parseInt(req.getParameter("t1"));
		 a[0][1]=Integer.parseInt(req.getParameter("t2"));
		 a[0][2]=Integer.parseInt(req.getParameter("t3"));
		 a[0][3]=Integer.parseInt(req.getParameter("t4"));
		 a[0][4]=Integer.parseInt(req.getParameter("t5"));
		 a[0][5]=Integer.parseInt(req.getParameter("t6"));
		 a[0][6]=Integer.parseInt(req.getParameter("t7"));
		 a[0][7]=Integer.parseInt(req.getParameter("t8"));
		 a[0][8]=Integer.parseInt(req.getParameter("t9"));
		 a[1][0]=Integer.parseInt(req.getParameter("t10"));
		 a[1][1]=Integer.parseInt(req.getParameter("t11"));
		 a[1][2]=Integer.parseInt(req.getParameter("t12"));
		 a[1][3]=Integer.parseInt(req.getParameter("t13"));
		 a[1][4]=Integer.parseInt(req.getParameter("t14"));
		 a[1][5]=Integer.parseInt(req.getParameter("t15"));
		 a[1][6]=Integer.parseInt(req.getParameter("t16"));
		 a[1][7]=Integer.parseInt(req.getParameter("t17"));
		 a[1][8]=Integer.parseInt(req.getParameter("t18"));
		 a[2][0]=Integer.parseInt(req.getParameter("t19"));
		 a[2][1]=Integer.parseInt(req.getParameter("t20"));
		 a[2][2]=Integer.parseInt(req.getParameter("t21"));
		 a[2][3]=Integer.parseInt(req.getParameter("t22"));
		 a[2][4]=Integer.parseInt(req.getParameter("t23"));
		 a[2][5]=Integer.parseInt(req.getParameter("t24"));
		 a[2][6]=Integer.parseInt(req.getParameter("t25"));
		 a[2][7]=Integer.parseInt(req.getParameter("t26"));
		 a[2][8]=Integer.parseInt(req.getParameter("t27"));
		 a[3][0]=Integer.parseInt(req.getParameter("t28"));
		 a[3][1]=Integer.parseInt(req.getParameter("t29"));
		 a[3][2]=Integer.parseInt(req.getParameter("t30"));
		 a[3][3]=Integer.parseInt(req.getParameter("t31"));
		 a[3][4]=Integer.parseInt(req.getParameter("t32"));
		 a[3][5]=Integer.parseInt(req.getParameter("t33"));
		 a[3][6]=Integer.parseInt(req.getParameter("t34"));
		 a[3][7]=Integer.parseInt(req.getParameter("t35"));
		 a[3][8]=Integer.parseInt(req.getParameter("t36"));
		 a[4][0]=Integer.parseInt(req.getParameter("t37"));
		 a[4][1]=Integer.parseInt(req.getParameter("t38"));
		 a[4][2]=Integer.parseInt(req.getParameter("t39"));
		 a[4][3]=Integer.parseInt(req.getParameter("t40"));
		 a[4][4]=Integer.parseInt(req.getParameter("t41"));
		 a[4][5]=Integer.parseInt(req.getParameter("t42"));
		 a[4][6]=Integer.parseInt(req.getParameter("t43"));
		 a[4][7]=Integer.parseInt(req.getParameter("t44"));
		 a[4][8]=Integer.parseInt(req.getParameter("t45"));
		 a[5][0]=Integer.parseInt(req.getParameter("t46"));
		 a[5][1]=Integer.parseInt(req.getParameter("t47"));
		 a[5][2]=Integer.parseInt(req.getParameter("t48"));
		 a[5][3]=Integer.parseInt(req.getParameter("t49"));
		 a[5][4]=Integer.parseInt(req.getParameter("t50"));
		 a[5][5]=Integer.parseInt(req.getParameter("t51"));
		 a[5][6]=Integer.parseInt(req.getParameter("t52"));
		 a[5][7]=Integer.parseInt(req.getParameter("t53"));
		 a[5][8]=Integer.parseInt(req.getParameter("t54"));
		 a[6][0]=Integer.parseInt(req.getParameter("t55"));
		 a[6][1]=Integer.parseInt(req.getParameter("t56"));
		 a[6][2]=Integer.parseInt(req.getParameter("t57"));
		 a[6][3]=Integer.parseInt(req.getParameter("t58"));
		 a[6][4]=Integer.parseInt(req.getParameter("t59"));
		 a[6][5]=Integer.parseInt(req.getParameter("t60"));
		 a[6][6]=Integer.parseInt(req.getParameter("t61"));
		 a[6][7]=Integer.parseInt(req.getParameter("t62"));
		 a[6][8]=Integer.parseInt(req.getParameter("t63"));
		 a[7][0]=Integer.parseInt(req.getParameter("t64"));
		 a[7][1]=Integer.parseInt(req.getParameter("t65"));
		 a[7][2]=Integer.parseInt(req.getParameter("t66"));
		 a[7][3]=Integer.parseInt(req.getParameter("t67"));
		 a[7][4]=Integer.parseInt(req.getParameter("t68"));
		 a[7][5]=Integer.parseInt(req.getParameter("t69"));
		 a[7][6]=Integer.parseInt(req.getParameter("t70"));
		 a[7][7]=Integer.parseInt(req.getParameter("t71"));
		 a[7][8]=Integer.parseInt(req.getParameter("t72"));
		 a[8][0]=Integer.parseInt(req.getParameter("t73"));
		 a[8][1]=Integer.parseInt(req.getParameter("t74"));
		 a[8][2]=Integer.parseInt(req.getParameter("t75"));
		 a[8][3]=Integer.parseInt(req.getParameter("t76"));
		 a[8][4]=Integer.parseInt(req.getParameter("t77"));
		 a[8][5]=Integer.parseInt(req.getParameter("t78"));
		 a[8][6]=Integer.parseInt(req.getParameter("t79"));
		 a[8][7]=Integer.parseInt(req.getParameter("t80"));
		 a[8][8]=Integer.parseInt(req.getParameter("t81"));
		
		int[][] arr=sol.solveSudoku(a);
		PrintWriter out=res.getWriter();
	
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				out.print(arr[i][j]+" ");
			}
			out.print("<br/>");
		}
	}
	
}
