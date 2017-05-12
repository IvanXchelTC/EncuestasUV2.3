<%-- 
    Document   : intento2
    Created on : 16/06/2016, 02:30:59 AM
    Author     : Ivan_XchelHG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="intento1.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
                DefaultPieDataset data = new DefaultPieDataset();
                while(rs.next()){
                    data.setValue(rs.getString(0),rs.getInt(1));
                }
                JFreeChart grafico = ChartFactory.createPieChart("cantidad",data,true,true,true);
                response.setContentType("image/JPEG");
                OutputStream sa = response.getOutputStream();
                ChartUtilities.writeChartAsJPEG(sa,grafico,600,600);
                
            }catch(Exception ex){
                out.print(ex);
            }
            %>
    </body>
</html>
