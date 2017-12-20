USE [master]
GO

/****** Object:  Table [dbo].[MSreplication_options]    Script Date: 12/17/2017 20:29:36 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[MSreplication_options]') AND type in (N'U'))
DROP TABLE [dbo].[MSreplication_options]
GO

USE [master]
GO

/****** Object:  Table [dbo].[MSreplication_options]    Script Date: 12/17/2017 20:29:36 ******/
SET ANSI_NULLS OFF
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[MSreplication_options](
	[optname] [sysname] NOT NULL,
	[value] [bit] NOT NULL,
	[major_version] [int] NOT NULL,
	[minor_version] [int] NOT NULL,
	[revision] [int] NOT NULL,
	[install_failures] [int] NOT NULL
) ON [PRIMARY]

GO

