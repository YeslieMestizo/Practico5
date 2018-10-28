<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Consultas Medicas</title>
</head>
<body>
    <header>
    <content tag="nav">
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">INFORMACI&Oacute;N<span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li>
                    <g:link controller="Paciente">Lista de pacientes</g:link>
                </li>
                <li>
                    <g:link controller="Consulta">Consultas</g:link>
                </li>
                <li>
                    <g:link controller="Practica">Pr&aacute;cticas</g:link>
                </li>
                <li>
                    <g:link controller="TipoPractica">Tipo de pr&aacute;cticas</g:link>
                </li>
            </ul>
        </li>
        
    </content>
    </header>

    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="fondo2.png" width="100%" heigth="20%" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1 style="font-size: 40px;">C O N S U L T A S</h1>
            <p>
                Bienvenido<br>Aqui usted puede realizar sus consultas.<br>              
            </p>
        </section>
    </div>
    <div class="row">
    <div class="col-sm-6">
    <!-- Content 1 -->
    <section class="content">
        <div class="container">
            <asset:image src="paciente.jpg"  class="img-responsive img-circle center-block" alt=""/>
            <h2 class="section-header">Pacientes</h2>
            <p class="lead text-muted">Aquí podra realizar operaciones tales como crear un nuevo paciente, modificar datos o eliminar</p>
            <g:link controller="Paciente" class="btn btn-primary btn-lg">Operar</g:link> 
            
        </div>
    </section>
    </div>
    <div class="col-sm-6"> 
    <!-- Content 2 -->
    <section class="content">
        <div class="container">
            <asset:image src="consulta.jpg"  class="img-responsive img-circle center-block" alt=""/>
            <h2 class="section-header">Consulta de Pacientes</h2>
            <p class="lead text-muted">Aquí podra realizar operaciones tales como crear un nueva consulta sobre los pacientes, modificar datos o eliminar</p>
            <g:link controller="Consulta" class="btn btn-primary btn-lg">Operar</g:link>
            
        </div>
    </section>
    </div>
    </div>
    
    <br><br><hr>
    <div class="row">
    <div class="col-sm-6"> 
        <!-- Content 3 -->
    <section class="content ">
        <div class="container">
            <asset:image src="practica.jpg"  class="img-responsive img-circle center-block" alt=""/>
            <h2 class="section-header">Practica de Pacientes</h2>
            <p class="lead text-muted">Aquí podra realizar operaciones tales como crear una nueva practica sobre un paciente, modificar datos o eliminar</p>
            <g:link controller="Practica" class="btn btn-primary btn-lg">Operar</g:link> 
            
        </div>
    </section>
    </div>
    <div class="col-sm-6">
    <!-- Content 4 -->
    <section class="content ">
        <div class="container">
            <asset:image src="tipoPractica.jpg"  class="img-responsive img-circle center-block" alt=""/>
            <h2 class="section-header">Tipo de Practica de Pacientes</h2>
            <p class="lead text-muted">Aquí podra realizar operaciones tales como crear un nuevo tipo de practica, modificar datos o eliminar</p>
            <g:link controller="TipoPractica" class="btn btn-primary btn-lg">Operar</g:link>
            
        </div>
    </section>
    </div>
    </div>
    <br><br><hr>
</body>
</html>