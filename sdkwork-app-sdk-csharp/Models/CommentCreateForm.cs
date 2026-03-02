using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CommentCreateForm
    {
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public string? Content { get; set; }
        public string? DeviceInfo { get; set; }
    }
}
