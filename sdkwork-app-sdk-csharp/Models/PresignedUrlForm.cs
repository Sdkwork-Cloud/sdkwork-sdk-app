using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PresignedUrlForm
    {
        public string? ObjectKey { get; set; }
        public string? Bucket { get; set; }
        public string? Method { get; set; }
        public int? ExpirationSeconds { get; set; }
    }
}
