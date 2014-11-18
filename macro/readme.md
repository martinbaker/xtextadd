<p>This contains some proposed additions to <a href="https://github.com/eclipse/xtext">Xtext</a>.</p>
<p>Xtext is a very powerful way to create a project IDE from a grammar but I would like some additional capabilities. I will put some small demonstrator projects here in the hope of persuading the Xtext team to include these capabilities in Xtext.</p>
<p>On this site a have added some small stand-alone projects with capabilities that I would like to see built-in to Xtext. </p>
<h3>Macro</h3>
<p>I have some code under construction which is eventually intended to support DSLs that require macros.</p>
<p>The first line is supposed to show a macro definition, this defines a macro 'x' which has the value 'a b c' </p>
<table border="1">
  <tr>
    <td><pre>macro x a b c
d x
e x</pre></td>
  </tr>
</table>
<p>The code in this project then substitutes every occurrence of 'x' by its value 'a b c' </p>
<table border="1">
  <tr>
    <td><pre>d a b c
e a b c</pre></td>
  </tr>
</table>
<p>This code runs between the lexer and the parser which means the macro  works on the token stream and not the character stream. This means that the macro must contain whole tokens and not partial tokens. So we can't have a macro to substitute the contents of strings, for example. </p>
<p>Note: I had a look at <a href="https://github.com/eclipse/xtext/tree/master/plugins/org.eclipse.xtend.lib.macro">xtend implementation of macros</a> and it looks very complcated, I am looking for somthing very simple which can be customised for different DSLs. But There is problem of defining macros between the lexer and parser if you need to have macros that can go out of scope. </p>
<p>More details:</p>
<ul>
  <li>The code is <a href="https://github.com/martinbaker/xtextadd/tree/master/macro">here</a>. </li>
  <li>I will put an enhancement request for this on Eclipse bug tracking system. </li>
</ul>
<h3>Other Projects</h3>
<p>I have some other projects related to this, see <a href="https://github.com/martinbaker/xtextadd">this page</a>. </p>