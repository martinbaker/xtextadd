package com.euclideanspace.xgener.generator

class LabelGenerator {
	var String name;
	var CharSequence code;

new(String n,CharSequence c){
	name =n;
	if (name == null) name="_ERROR_";
	if (name.equals("")) name="_ERROR_";
	code =c;
	if (code == null) name='''_ERROR_''';
	if (code == '''''') code='''_ERROR_''';
}

def String getName() {
	return name;
}

def boolean isName(String n) {
	return name.equals(n);
}

def CharSequence getCode() {
	return
'''def String text(«name» ele) {
  «code»
}'''
}
}