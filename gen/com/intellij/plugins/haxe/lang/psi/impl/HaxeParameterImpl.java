/*
 * Copyright 2000-2013 JetBrains s.r.o.
 * Copyright 2014-2014 AS3Boyan
 * Copyright 2014-2014 Elias Ku
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi.impl;

import com.intellij.psi.*;
import com.intellij.psi.impl.source.PsiParameterImpl;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.plugins.haxe.lang.psi.*;

public class HaxeParameterImpl extends AbstractHaxeNamedComponent implements HaxeParameter {

  public HaxeParameterImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaxeVisitor) ((HaxeVisitor)visitor).visitParameter(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HaxeComponentName getComponentName() {
    return findNotNullChildByClass(HaxeComponentName.class);
  }

  @Override
  @Nullable
  public HaxeTypeTag getTypeTag() {
    return findChildByClass(HaxeTypeTag.class);
  }

  @Override
  @Nullable
  public HaxeVarInit getVarInit() {
    return findChildByClass(HaxeVarInit.class);
  }


  @NotNull
  // @ O v e r r i d e
  public PsiElement getDeclarationScope() {
    return null;
  }

  // @ O v e r r i d e
  public boolean isVarArgs() {
    return false;
  }

  @Nullable
  // @ O v e r r i d e
  public PsiTypeElement getTypeElement() {
    return null;
  }

  @NotNull
  // @ O v e r r i d e
  public PsiType getType() {
    return null;
  }

  @Nullable
  // @ O v e r r i d e
  public PsiExpression getInitializer() {
    return null;
  }

  // @ O v e r r i d e
  public boolean hasInitializer() {
    return false;
  }

  // @ O v e r r i d e
  public void normalizeDeclaration() throws IncorrectOperationException {

  }

  @Nullable
  // @ O v e r r i d e
  public Object computeConstantValue() {
    return null;
  }

  @Nullable
  // @ O v e r r i d e
  public PsiIdentifier getNameIdentifier() {
    return null;
  }

  @Nullable
  // @ O v e r r i d e
  public PsiModifierList getModifierList() {
    return null;
  }

  // @ O v e r r i d e
  public boolean hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull String name) {
    return false;
  }
}
