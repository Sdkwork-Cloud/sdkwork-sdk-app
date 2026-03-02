using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShareUpdateForm
    {
        public string? ShareId { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? ImageUrl { get; set; }
        public int? ExpireSeconds { get; set; }
        public bool? PasswordRequired { get; set; }
        public string? Password { get; set; }
        public string? Status { get; set; }
    }
}
