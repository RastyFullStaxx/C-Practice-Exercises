module com.example.myapp {
    requires java.base;
    uses com.example.myapp.MyService;
    exports com.example.myapp;
}

// Service Provider Implementation
module com.example.myapp.provider {
    requires com.example.myapp;
    provides com.example.myapp.MyService with com.example.myapp.provider.MyServiceImpl;
}
