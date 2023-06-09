<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html lang="fr">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Fines Saveurs | Fiche produit</title>
    <%@include file="../styling/import-styles.jsp" %>
    <style>
        <%@include file="../styling/global.css"%>
        <%@include file="../styling/product-details.css"%>
    </style>
</head>

<body id="products">

<c:import url="header.jsp"/>

<div class="page">

    <div class="container py-5">
        <div class="row">
            <div class="col">
                <h2 class="text-center">Fiche produit</h2>
            </div>
        </div>
    </div>

    <div class="container px-0 py-3" id="product-info">
        <div class="row justify-content-between">
            <div class="col-6 p-3">

                <dl class="row">

                    <dt class="col-sm-3 py-3">Nom</dt>
                    <dd class="col-sm-9 py-3 uppercase bold small"> ${product.name} </dd>
                    <hr>
                    <dt class="col-sm-3 py-3">Marque</dt>
                    <dd class="col-sm-9 py-3 bold"> ${product.brand} </dd>
                    <hr>
                    <dt class="col-sm-3 py-3">Référence</dt>
                    <dd class="col-sm-9 py-3"> ${product.reference} </dd>
                    <hr>
                    <dt class="col-sm-3 py-3">Prix</dt>
                    <dd class="col-sm-9 py-3"> ${product.price} €</dd>
                    <hr>
                    <dt class="col-sm-3 py-3">Conditionnement</dt>
                    <dd class="col-sm-9 py-3"> ${product.conditioning} </dd>
                    <hr>
                    <dt class="col-sm-3 py-3">Description</dt>
                    <dd class="col-sm-9 py-3"> ${product.description} </dd>
                    <hr>
                    <dt class="col-sm-3 py-3">Ingrédients</dt>
                    <dd class="col-sm-9 py-3"> ${product.ingredient} </dd>
                    <hr>
                    <dt class="col-sm-3 py-3">Origine</dt>
                    <dd class="col-sm-9 py-3"> ${product.origin} </dd>
                    <hr>
                    <dt class="col-sm-3 py-3">Stock</dt>
                    <dd class="col-sm-9 py-3"> ${product.stock} </dd>
                    <hr>
                    <dt class="col-sm-3 py-3">Catégorie</dt>
                    <dd class="col-sm-9 py-3"> ${product.category.name} </dd>

                </dl>

            </div>

            <div class="col-5 img-container position-relative p-0">
                <a href="${pageContext.request.contextPath}/secured/edit-image?id=${product.id}">
                    <img src="/images/bxs_camera.svg" alt="icone appareil photo" class="position-absolute icon">
                </a>
                <c:choose>
                    <c:when test="${product.imageUrl == null || product.imageUrl.length() == 0}">
                        <img src="/images/placeholder.jpg" alt="photo du produit" class="product-img">
                    </c:when>
                    <c:otherwise>
                        <img src="image?file=${pageContext.request.contextPath}${product.imageUrl}" alt="photo du produit" class="product-img">
                    </c:otherwise>
                </c:choose>
            </div>

        </div>
    </div>

    <div class="container-fluid mx-auto">
        <div class="row">
            <div class="col">

                <div class="container">
                    <div class="row">
                        <div class="col">
                            <a href="${pageContext.request.contextPath}/secured/edit-product?id=${product.id}" class="underline-none">
                                <button class="button d-block my-5">Éditer</button>
                            </a>
                        </div>
                        <div class="col">
                            <a href="${pageContext.request.contextPath}/secured/delete-product?id=${product.id}&name=${product.name}" class="underline-none">
                                <button class="button d-block ms-auto my-5" type="submit">Supprimer</button>
                            </a>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>

</div>

</body>

</html>