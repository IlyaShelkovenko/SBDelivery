/**
 * Created by Ilia Shelkovenko on 16.01.2021.
 */

package ru.skillbranch.sbdelivery.network

import retrofit2.Call
import retrofit2.http.*
import ru.skillbranch.sbdelivery.data.remote.requests.*
import ru.skillbranch.sbdelivery.data.remote.responses.*


interface SbDeliveryApi {

    @POST("auth/login")
    @Headers("Content-Type:application/json")
    fun login(@Body login: LoginRequest) : Call<LoginResponse>

    @POST("auth/register")
    @Headers("Content-Type:application/json")
    fun register(@Body registerRequest: RegisterRequest) : Call<RegisterResponse>

    @POST("auth/recovery/email")
    @Headers("Content-Type:application/json")
    fun recoverPasswordStepOne(email : String) : Call<Int>

    @POST("auth/recovery/code")
    @Headers("Content-Type:application/json")
    fun recoverPasswordStepTwo(recoverTwoRequest: RecoverPasswordStepTwoRequest) : Call<Int>

    @POST("auth/recovery/password")
    @Headers("Content-Type:application/json")
    fun recoverPasswordStepThree(recoverThreeRequest: RecoverPasswordStepThreeRequest) : Call<Int>

    @POST("auth/recovery/refresh")
    @Headers("Content-Type:application/json")
    fun refreshToken(token: String) : Call<String>

    @GET("profile")
    fun getProfile(@Header("Authorization:Bearer") token: String) : Call<ProfileResponse>

    @PUT("profile")
    fun editProfile(editProfileRequest: EditProfileRequest) :  Call<ProfileResponse>

    @PUT("profile/password")
    fun changePassword(changePassword: ChangePasswordRequest) : Call<Int>

    @GET("favorite")
    fun getFavorite(
        @Query("offset")offset: Int = 0,
        @Query("limit")limit: Int = 10
    ) : Call<List<FavoriteDishResponse>>

    @PUT("favorite")
    fun changeFavorite(changeFavoriteResponse: ChangeFavoriteResponse) : Call<Int>

    @GET("main/recommend")
    fun getRecommend() : Call<List<String>>

    @GET("categories")
    @Headers("Content-Type:application/json")
    fun getCategories(
        @Query("offset")offset: Int = 0,
        @Query("limit")limit: Int = 10
    ) : Call<List<CategoriesResponse>>

    @GET("dishes")
    @Headers("Content-Type:application/json")
    fun getDishes(
        @Query("offset")offset: Int = 0,
        @Query("limit")limit: Int = 10
    ) : Call<List<DishesResponse>>

    @GET("reviews/{dishId}")
    @Headers("Content-Type:application/json")
    fun getReviews(
        @Path("dishId")dishId: String,
        @Query("offset")offset: Int = 0,
        @Query("limit")limit: Int = 10
    ) : Call<List<ReviewResponse>>

    @POST("reviews/{dishId}")
    fun addReview(@Path("dishId")dishId: String, addReview: AddReviewRequest) : Call<Int>

}