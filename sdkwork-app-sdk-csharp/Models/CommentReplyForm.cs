using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CommentReplyForm
    {
        public string? Content { get; set; }
        public string? DeviceInfo { get; set; }
    }
}
