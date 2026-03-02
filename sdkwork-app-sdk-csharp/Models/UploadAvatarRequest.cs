using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UploadAvatarRequest
    {
        public string? File { get; set; }
    }
}
