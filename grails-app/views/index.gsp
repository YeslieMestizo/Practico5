<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Consultas Medicas</title>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
</head>
<body>
    <header>
    <content tag="nav">
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Informacion <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Pacientes: </a></li>
                <li><a href="#">Consultas: ${grails.util.Environment.current.name}</a></li>
                <li><a href="tipoPractica/index.gsp">Practicas: ${grails.util.Environment.current.name}</a></li>
                <!--<li><a href="#">Environment: ${grails.util.Environment.current.name}</a></li>
                <li><a href="#">App profile: ${grailsApplication.config.grails?.profile}</a></li>
                <li><a href="#">App version:
                    <g:meta name="info.app.version"/></a></li>
                <li role="separator" class="divider"></li>
                <li><a href="#">Grails version:
                    <g:meta name="info.app.grailsVersion"/></a></li>
                <li><a href="#">Groovy version: ${GroovySystem.getVersion()}</a></li>
                <li><a href="#">JVM version: ${System.getProperty('java.version')}</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="#">Reloading active: ${grails.util.Environment.reloadingAgentEnabled}</a></li>-->
            </ul>
        </li>
        <!--<li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Consultas <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Controllers: ${grailsApplication.controllerClasses.size()}</a></li>
                <li><a href="#">Domains: ${grailsApplication.domainClasses.size()}</a></li>
                <li><a href="#">Services: ${grailsApplication.serviceClasses.size()}</a></li>
                <li><a href="#">Tag Libraries: ${grailsApplication.tagLibClasses.size()}</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Installed Plugins <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <g:each var="plugin" in="${applicationContext.getBean('pluginManager').allPlugins}">
                    <li><a href="#">${plugin.name} - ${plugin.version}</a></li>
                </g:each>
            </ul>
        </li>-->
    </content>
    </header>

    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <!--<asset:image src="grails-cupsonly-logo-white.svg" class="grails-logo"/>-->
            <asset:image src="fondo2.png" width="100%" heigth="20%" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1 style="font-size: 40px;">C O N S U L T A S</h1>
            <p>
                Bienvenido<br>Aqui usted puede realizar sus consultas.
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
    <footer>
        Catamarca - soporte-medico<br>
        Argentina
    </footer>
    
    
</body>
</html>