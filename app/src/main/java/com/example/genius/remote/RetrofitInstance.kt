package com.example.genius.remote

import com.example.genius.repo.ApiService
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Inject

class RetrofitInstance @Inject constructor(private val retrofit: Retrofit){

    /*
      Identifies injectable constructors, methods, and fields.
      May apply to static as well as instance members.
      An injectable member may have any access modifier (private, package-private, protected, public).
      Constructors are injected first, followed by fields, and then methods.
      Fields and methods in superclasses are injected before those in subclasses.
      Ordering of injection among fields and among methods in the same class is not specified.
      Injectable constructors are annotated with @Inject and accept zero or more dependencies as arguments.
      @Inject can apply to at most one constructor per class.
   */





    val geniusService : ApiService by lazy{retrofit.create(ApiService::class.java)}

    val hot100Service : ApiService by lazy{retrofit.create(ApiService::class.java)}

    val googleNewsService : ApiService by lazy{retrofit.create(ApiService::class.java)}



}