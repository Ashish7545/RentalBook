
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        .container{
            background:black;
        }
        .about-section {
            padding: 50px;
            text-align: center;
            background-color: #474e5d;
            color: white;
        }
            .card {
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
            margin: 8px;
        }
        
    </style>
    <body>
        
            <div class="about-section">
                <h1>About Us Page</h1>
                <p>Some text about who we are and what we do.</p>
                <p>Resize the browser window to see that this page is responsive by the way.</p>
            </div>
       
        <h2 style="text-align: center">Our team</h2>
        <div class="row">
            <div class="column">
                <div class="card">
                    <img src="/img/im.jpg" style="width:100%">
                    <div class="container">
                        <h2>Jane Doe</h2>
                        <p class="title">CEO & Founder</p>
                        <p>Some text that describes me lorem ipsum ipsum lorem.</p>
                        <p>jane@example.com</p>
                        <p><button class="button">Contact</button></p>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
