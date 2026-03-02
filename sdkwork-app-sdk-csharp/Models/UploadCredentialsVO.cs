using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UploadCredentialsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? AccessKeyId { get; set; }
        public string? SecretAccessKey { get; set; }
        public string? SessionToken { get; set; }
        public string? ExpirationTime { get; set; }
        public string? Bucket { get; set; }
        public string? Region { get; set; }
    }
}
