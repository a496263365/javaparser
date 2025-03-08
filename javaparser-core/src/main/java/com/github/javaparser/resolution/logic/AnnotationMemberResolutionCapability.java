package com.github.javaparser.resolution.logic;

import com.github.javaparser.resolution.declarations.ResolvedAnnotationMemberDeclaration;
import com.github.javaparser.resolution.model.SymbolReference;
import com.github.javaparser.resolution.types.ResolvedType;

import java.util.List;

public interface AnnotationMemberResolutionCapability {
    SymbolReference<ResolvedAnnotationMemberDeclaration> solveMember(
            String name, List<ResolvedType> argumentsTypes, boolean staticOnly);
}
