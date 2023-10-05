package dev.velasquez.desafioarquitecturasandroid

import retrofit2.http.GET

interface MoviesService {
    @GET("discover/movie?api_key=80f9a0365fcbbb9f1da389ec2cbeb877")
    suspend fun getMovies(): MovieResult

}