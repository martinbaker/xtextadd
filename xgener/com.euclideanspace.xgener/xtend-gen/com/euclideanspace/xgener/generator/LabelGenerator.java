package com.euclideanspace.xgener.generator;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class LabelGenerator {
  private String name;
  
  private CharSequence code;
  
  public LabelGenerator(final String n, final CharSequence c) {
    this.name = n;
    boolean _equals = Objects.equal(this.name, null);
    if (_equals) {
      this.name = "_ERROR_";
    }
    boolean _equals_1 = this.name.equals("");
    if (_equals_1) {
      this.name = "_ERROR_";
    }
    this.code = c;
    boolean _equals_2 = Objects.equal(this.code, null);
    if (_equals_2) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("_ERROR_");
      this.name = _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    boolean _equals_3 = Objects.equal(this.code, _builder_1);
    if (_equals_3) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("_ERROR_");
      this.code = _builder_2;
    }
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean isName(final String n) {
    return this.name.equals(n);
  }
  
  public CharSequence getCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("def String text(");
    _builder.append(this.name, "");
    _builder.append(" ele) {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append(this.code, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
}
