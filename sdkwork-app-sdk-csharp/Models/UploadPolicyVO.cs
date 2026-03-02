using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UploadPolicyVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? BucketName { get; set; }
        public string? ObjectKeyPrefix { get; set; }
        public string? ExpirationTime { get; set; }
        public int? MaxFileSize { get; set; }
        public int? MinFileSize { get; set; }
        public List<string>? AllowedContentTypes { get; set; }
        public bool? AllowOverwrite { get; set; }
        public string? CallbackUrl { get; set; }
    }
}
